import java.util.Scanner;

public class Bai2_MenuMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so hang: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so cot: ");
        int colum = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][colum];
        do {
            System.out.println("*************Menu*************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("4. Sắp xếp mảng tăng dần theo cột");
            System.out.println("5. Thoát");
            System.out.print("Lua chon cua ban la: ");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice<1||choice>5){
                System.err.println("Vui long chon lai trong khoang 1-5: ");
                 choice = Integer.parseInt(sc.nextLine());
            }
            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            System.out.printf("Nhap gia tri Arr[%d][%d]= ",i,j);
                            arr[i][j]=Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            System.out.printf("%d\t",arr[i][j]);
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    if (row!=colum){
                        System.err.println("Hay bat dau lai voi so hang bang voi so cot");
                        System.exit(0);
                    }else {
                        int tongChinh=0;
                        int tongPhu=0;
                        System.out.println("phan tu o duong cheo chinh la");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < colum; j++) {
                                if (i==j){
                                    System.out.println(arr[i][j]);
                                    tongChinh+=arr[i][j];
                                }else {
                                    continue;
                                }
                            }
                        }
                        System.out.println("Tong Chinh = "+tongChinh);
                        System.out.println("phan tu o duong cheo phu la");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < colum; j++) {
                                if (i+j==row-1){
                                    System.out.println(arr[i][j]);
                                    tongPhu+=arr[i][j];
                                }else {
                                    continue;
                                }
                            }
                        }
                        System.out.println("Tong Chinh = "+tongPhu);
                    }
                    break;
                case 4:
                    int temp;
                        for (int j = 0; j < colum; j++) {
                            for (int k = 0; k < row; k++) {
                                for (int l = 0; l < colum; l++) {
                                    if (arr[j][k]<arr[l][k]){
                                        temp=arr[j][k];
                                        arr[j][k]=arr[l][k];
                                        arr[l][k]=temp;
                                    }
                                }
                            }
                        }
                    System.out.println(" mang moi la :");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            System.out.printf("%d\t",arr[i][j]);
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("Ban da thoat khoi chuong trinh.");
                    break;
            }
        } while (true);
    }
}