import java.util.*;
public class OOpsBasics {

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = 0;
        int var3 = var1.nextInt();
        int[] var4 = new int[var3];

        int var5;
        for(var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.nextInt();
        }

        var5 = var1.nextInt();
        int var6 = 0;
        int var7 = var3 - 1;
        int var8 = -1;

        while(var6 <= var7) {
            int var9 = (var6 + var7) / 2;
            ++var2;
            if (var4[var9] == var5) {
                var8 = var9;
                break;
            }

            if (var4[var9] < var5) {
                var6 = var9 + 1;
            } else {
                var7 = var9 - 1;
            }
        }

        System.out.println(var8);
        System.out.println(var2);
    }
}
