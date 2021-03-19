import java.util.Arrays;

public class q8 {
    public static void main( String[ ] args ) {
        int[ ] v1 = { 1 , 1 , 9 , 7 , 9 , 5 , 3 , 4 , 2 , 3 ,5 , 1 };
        int[ ] v2 = new int[ v1.length ];
        int qtd = 0;
        for( int i = 0 ; i < v1.length ; i++ ) {
            boolean existe = false;
            for( int j = 0 ; j < qtd ; j++ ) {
                if( v2[ j ] == v1[ i ] ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                v2[ qtd++ ] = v1[ i ];
            }
        }
        v2 = Arrays.copyOf( v2 , qtd );
        for( int i = 0 ; i < v2.length ; i++ ) {
            System.out.print(v2[ i ]+" " );
        }

    }
}
