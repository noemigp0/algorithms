class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        //variable to save the reversed number
        int reversed = 0;
        int n = x;//121

        while(n > 0){//porque?
            //usar modulo paara obtener el ultimo numero
            int lastDigit = n % 10; //2
            //guardar este digito en reversed para irlo revirtiendo
            //toma en cuenta que para ir revirtiendo el numero aquí no podemos concatenar entonces hay que hacer operaciones
            //ya tengo el 1 que tengo que haces para que n ahora valga 12
            //tengo que hace espacio para poder sumar el digito que quiero añadir, y eso funcion multiplicandolo por 10
            reversed = reversed * 10 + lastDigit; //1
            //Si divido entre 10 me seguro de eliminar el ultimo digito, esto haciendo lo opuesto al módulo
            n = n / 10; //12

            //121

        }

        return x == reversed;

        
    }
}