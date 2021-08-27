package 面试;

//无人机探测地形
import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static int getCount1(int[][] arr) {
        if(arr == null || arr.length == 0 || arr[0].length == 0) {
            return 0;
        }
        int n = arr.length, m = arr[0].length;
        boolean[][] used = new boolean[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        int index = 0, count = 0;
        for(int i = 0; i < n * m; i++) {
            used[x][y] = true;
            if(index % 2 == 0) {
                count++;
            }
            index++;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b>= m || used[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return count;
    }

    public static int getCount2(int[][] arr) {
        if(arr == null || arr.length == 0 || arr[0].length == 0) {
            return 0;
        }
        int n = arr.length, m = arr[0].length;
        boolean[][] used = new boolean[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        int index = 0, count = 0;
        for(int i = 0; i < n * m; i++) {
            used[x][y] = true;
            if(index % 3 == 0) {
                count++;
            }
            index++;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b>= m || used[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return count;
    }
    public static void getMap1(String[][] map, String[] pictureData) {
        int len = pictureData.length;
        if(pictureData == null || pictureData.length == 0 || map == null) {
            return ;
        }
        int n = map.length, m = map[0].length;
        boolean[][] used = new boolean[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        int index = 0, piIndex = 0;
        for(int i = 0; i < n * m; i++) {
            used[x][y] = true;
            if(index % 2 == 0) {
                String curRegion = pictureData[piIndex++];
                for(int j = 0; j < curRegion.length(); j++) {
                    if(j == 0 && curRegion.charAt(j) != '-') {
                        map[x][y] = String.valueOf(curRegion.charAt(j));
                    }
                    if(j == 1 && curRegion.charAt(j) != '-' ){
                        map[x - 1][y] = String.valueOf(curRegion.charAt(j) );
                    }
                    if(j == 2 && curRegion.charAt(j) != '-'){
                        map[x][y + 1] = String.valueOf(curRegion.charAt(j) );
                    }
                    if(j == 3 && curRegion.charAt(j) != '-' ){
                        map[x + 1][y] = String.valueOf(curRegion.charAt(j));
                    }
                    if(j == 4 && curRegion.charAt(j) != '-'){
                        map[x][y - 1] = String.valueOf(curRegion.charAt(j));
                    }
                }
            }
            index++;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b>= m || used[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
    }

    public static void getMap2(String[][] map, String[] pictureData) {
        int len = pictureData.length;
        if(pictureData == null || pictureData.length == 0) {
            return ;
        }
        int n = map.length, m = map[0].length;
        boolean[][] used = new boolean[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        int index = 0, piIndex = 0;
        for(int i = 0; i < n * m; i++) {
            used[x][y] = true;
            if(index % 3 == 0) {
                String curRegion = pictureData[piIndex++];
                for(int j = 0; j < curRegion.length(); j++) {
                    if(j == 0 && curRegion.charAt(j) != '-') {
                        map[x][y] = String.valueOf(curRegion.charAt(j));
                    }
                    if(j == 1 && curRegion.charAt(j) != '-' ){
                        map[x - 1][y] = String.valueOf(curRegion.charAt(j) );
                    }
                    if(j == 2 && curRegion.charAt(j) != '-'){
                        map[x][y + 1] = String.valueOf(curRegion.charAt(j) );
                    }
                    if(j == 3 && curRegion.charAt(j) != '-' ){
                        map[x + 1][y] = String.valueOf(curRegion.charAt(j));
                    }
                    if(j == 4 && curRegion.charAt(j) != '-'){
                        map[x][y - 1] = String.valueOf(curRegion.charAt(j));
                    }
                }
            }
            index++;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b>= m || used[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
    }
    public static void printMap(String[][] map) {
        if(map == null || map.length == 0 || map[0].length == 0) {
            return ;
        }
        int n = map.length, m = map[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int N = scan.nextInt(), M = scan.nextInt();
            int[][] arr = new int[N][M];
            int n = 0;
            if(N == 3 || M == 3) {
                n = getCount1(arr);
            }else {
                n = getCount2(arr);
            }
            String[] pictureData = new String[n];
            for(int i = 0; i < n; i++) {
                pictureData[i] = scan.next();
            }
            System.out.println(Arrays.toString(pictureData));
            String[][] map = new String[N][M];
            if(N == 0 || M == 0) {
                printMap(map);
            }else {
                if(N == 3 || M == 3) {
                    getMap1(map,pictureData);
                }else {
                    getMap2(map,pictureData);
                }
                printMap(map);
            }
        }
    }
}

