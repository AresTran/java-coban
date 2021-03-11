import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    /* Tính số ngày lệch giữa 02 ngày nhập vào
    Thực hiện:
    B1. Nhập vào 02 giá trị String: dd/MM/yyyy
    B2. Convert giá trị đầu vào String --> Date thông quan SimpleDateFormat
    B3. Chuyển 02 giá trị nhập vào về mili giây
    B4. Lấy trị truyệt đối độ lệch của 02 giá trị này
    B5. Chia từ mili giây thành ngày
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ngày thứ 1: ");
        String start = scanner.nextLine();
        System.out.println("Ngày thứ 2: ");
        String end = scanner.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date startDate = simpleDateFormat.parse(start);
            Date endDate = simpleDateFormat.parse(end);

            long startValue = startDate.getTime();
            long endValue = endDate.getTime();
            long tmp = Math.abs(startValue - endValue);

            long result = tmp / (24 * 60 * 60 * 1000); // mili giây --> ngày
            System.out.println("Số ngày chênh lệch: " + result);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
