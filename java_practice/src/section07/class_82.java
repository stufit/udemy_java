package section07;

/**
 * 유효한 삼각형인지 확인
 * 유효한 삼각형을 형성하면 true, 아니면 false
 */
public class class_82 {
    public boolean isValidTriangle(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0){
            return false;
        }
        return a + b == 180 - c && a + c == 180 - b && b + c == 180 - a;
    }
}
