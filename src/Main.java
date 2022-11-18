import java.util.Arrays;

public class Main {

    // Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. 
    static void printArray(int[][] arr)
    {
        for (int[] i: arr){                 //Bu metot dizileri yazdırma kodlarını birden çok yazmamızı önler
            for (int j: i)
            {
                System.out.print(j+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matris=new int[][]{{2,3,4},{5,6,4}};
        int[][] transpoze=new int[matris[0].length][matris.length]; // matris dizisinin sütun değerini transpozun satır değerine
                                                                    // satır değerini de sütun değerine yazma

        for (int i=0;i<transpoze.length; i++)
        {
            for (int j=0; j<transpoze[0].length;j++)
            {
                transpoze[i][j]=matris[j][i]; // matris dizinin sütunlarını transpoze dizisinin satırına, satırlarını sütuna yazma
            }
        }

        System.out.println("Matris:");
        printArray(matris); // metot ile matris dizisini yazdırma

        System.out.println("Transpoze:");
        printArray(transpoze); // metot ile transpoze dizisini yazdırma

    }
}