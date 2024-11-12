import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 파일 개수와 파일 크기 입력
        int fileCount = sc.nextInt();
        long[] fileSizes = new long[fileCount];
        
        for (int i = 0; i < fileCount; i++) {
            fileSizes[i] = sc.nextLong();
        }

        // 클러스터 크기 입력
        long clusterSize = sc.nextLong();
        long totalDiskUsage = 0;

        // 각 파일의 실제 디스크 사용량 계산
        for (long fileSize : fileSizes) {
            if (fileSize > 0) {
                totalDiskUsage += ((fileSize + clusterSize - 1) / clusterSize) * clusterSize;
            }
        }

        System.out.println(totalDiskUsage);
        sc.close();
    }
}
