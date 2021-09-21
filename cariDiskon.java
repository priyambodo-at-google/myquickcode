import java.util.Scanner;

public class cariDiskon
{
    public static void main (String []args)
    {
        int vPersen = 0;
        double vFinal = 0;
        double vDiskon = 0;
        double vBayar = 0;
        double vKembali = 0;

        Scanner vInput = new Scanner(System.in);

        System.out.print("Berapa jumlah barang yang dibeli? ");
        double vBanyak = vInput.nextDouble();

        System.out.print("Berapa harga satuan dari barang tersebut? ");
        double vSatuan = vInput.nextDouble();

        double vTotal = (vBanyak * vSatuan);

        if(vTotal < 100000)
        {
            vPersen = 0;
        }
        else if(vTotal >= 100001 && vTotal < 200000)
        {
            vPersen = 5;
        }
        else if(vTotal >= 200001 && vTotal < 300000)
        {
            vPersen = 10;
        }
        else if(vTotal >= 300001 && vTotal < 400000)
        {
            vPersen = 15;
        }
        else if(vTotal >= 400001 && vTotal < 500000)
        {
            vPersen = 20;
        }
        else if (vTotal > 500000){
            vPersen = 25;
        }
        
        vDiskon = (vTotal * vPersen / 100) ;
        vFinal = (vTotal - vDiskon);

        System.out.print("Total Pembelian = " + vTotal + "\n");
        System.out.print("Jumlah Diskon = " + vDiskon + "\n");
        System.out.print("Harga Final setelah dikurang diskon = " + vFinal + "\n");

        System.out.print("Masukkan rupiah pembayaran anda = ");
        vBayar = vInput.nextDouble();
        
        if (vBayar == vFinal)
        {
            System.out.print("Uang Pas \n");
        }
            else 
            {
                vKembali = vBayar - vFinal;
                System.out.print("Kembalian anda adalah = " + vKembali + "\n"); 
            };
    }
}
