package CramersRue;

public class GFG {
static double determinantOfMatrix(double mat[][])
{
    double ans;
    ans = mat[0][0] * (mat[1][1] * mat[2][2] - mat[2][1] * mat[1][2])
        - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
        + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
    return ans;
}
 

static void findSolution(double coeff[][])
{
    // Matrix d using coeff as given in cramer's rule
    double d[][] = {
        { coeff[0][0], coeff[0][1], coeff[0][2] },
        { coeff[1][0], coeff[1][1], coeff[1][2] },
        { coeff[2][0], coeff[2][1], coeff[2][2] },
    };
     
    // Matrix d1 using coeff as given in cramer's rule
    double d1[][] = {
        { coeff[0][3], coeff[0][1], coeff[0][2] },
        { coeff[1][3], coeff[1][1], coeff[1][2] },
        { coeff[2][3], coeff[2][1], coeff[2][2] },
    };
     
    // Matrix d2 using coeff as given in cramer's rule
    double d2[][] = {
        { coeff[0][0], coeff[0][3], coeff[0][2] },
        { coeff[1][0], coeff[1][3], coeff[1][2] },
        { coeff[2][0], coeff[2][3], coeff[2][2] },
    };
     
    // Matrix d3 using coeff as given in cramer's rule
    double d3[][] = {
        { coeff[0][0], coeff[0][1], coeff[0][3] },
        { coeff[1][0], coeff[1][1], coeff[1][3] },
        { coeff[2][0], coeff[2][1], coeff[2][3] },
    };
 
    // Calculating Determinant of Matrices d, d1, d2, d3
    double D = determinantOfMatrix(d);
    double D1 = determinantOfMatrix(d1);
    double D2 = determinantOfMatrix(d2);
    double D3 = determinantOfMatrix(d3);
    System.out.printf("D is : %.6f \n", D);
    System.out.printf("D1 is : %.6f \n", D1);
    System.out.printf("D2 is : %.6f \n", D2);
    System.out.printf("D3 is : %.6f \n", D3);
 
    // Case 1
    if (D != 0) 
    {
        // Coeff have a unique solution. Apply Cramer's Rule
        double x = D1 / D;
        double y = D2 / D;
        double z = D3 / D; // calculating z using cramer's rule
        System.out.printf("Value of x is : %.6f\n", x);
        System.out.printf("Value of y is : %.6f\n", y);
        System.out.printf("Value of z is : %.6f\n", z);
    }
     
    // Case 2
    else
    {
        if (D1 == 0 && D2 == 0 && D3 == 0)
            System.out.printf("Infinite solutions\n");
        else if (D1 != 0 || D2 != 0 || D3 != 0)
            System.out.printf("No solutions\n");
    }
}
 
// Driver Code
public static void main(String[] args)
{
    // storing coefficients of linear
    // equations in coeff matrix
    double coeff[][] = { { 3, -0.1, -0.2, 7.85 },
                      { 0.1, 7, -0.3, -19.3 },
                      {0.3, -0.2, 10, 71.4 } };
    findSolution(coeff);
    }
}
