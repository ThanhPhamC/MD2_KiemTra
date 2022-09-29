import java.util.Scanner;

public class Bai1_MenuMang1Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int lenght = Integer.parseInt(sc.nextLine());
        int[] arr = new int[lenght];
        int tong = 0;
        do {
            System.out.println("*************Menu*************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");
            System.out.print("Lua chon cua ban la: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < lenght; i++) {
                        System.out.printf("arr[%d]= ", i);
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("------------Mang khoi tao la: ");
                    for (int i = 0; i < lenght; i++) {
                        System.out.printf("%d\t", arr[i]);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("cac so nguyen to co trong mang la: ");
                    for (int i = 0; i < lenght; i++) {
                        if (arr[i] >= 2) {
                            boolean check = true;
                            for (int j = 2; j < arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    check = false;
                                    break;
                                }
                            }
                            if (check) {
                                System.out.print(arr[i] + "  ");
                            }
                        }
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    int maxx = arr[0];
                    int minn = arr[0];
                    for (int i = 0; i < lenght; i++) {
                        if (maxx < arr[i]) {
                            maxx = arr[i];
                        }
                    }
                    System.out.printf("gia tri max la %d\n", maxx);
                    for (int i = 0; i < lenght; i++) {
                        if (minn > arr[i]) {
                            minn = arr[i];
                        }
                    }
                    System.out.printf("gia tri min la %d\n", minn);
                    break;
                case 5:
                    int temp;
                    for (int i = 0; i < lenght - 1; i++) {
                        for (int j = i + 1; j < lenght; j++) {
                            if (arr[i] < arr[j]) {
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    System.out.println("mang moi sau khi sap xep giam dan la ");
                    for (int i = 0; i < lenght; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
