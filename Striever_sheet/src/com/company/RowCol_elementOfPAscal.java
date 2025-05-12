package com.company;

public class RowCol_elementOfPAscal {

static int factorial(int n){
    int k=1;
    for(int i=2; i<=n ;i++){
        k*=i;
    }
    return k;
}

static int rowColELement(int row , int col){

//    element  = r-1 C c-1;
    return factorial(row-1)/(factorial(col-1)*factorial(row-col));

}
    public static void main(String[] args) {
        System.out.println(rowColELement(5 ,3 ));
    }
}
