package section07;

/**
 * 시험 결과 검사기
 * 50점이 넘으면 true, 아니면 false를 준다.
 */
public class class_81 {
    // 첫번째 방법

    public boolean isPass(int score){
        if(score >= 50){
            return true;
        }
        return false;
    }
    // 두번째 방법
    public boolean isPass2(int score){
        boolean returnValue = score > 50;
        return returnValue;
    }

    // 세번째 방법
    public boolean isPass3(int score){
        return score > 50;
    }
}
