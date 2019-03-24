/*
 *  @(#)Game.java       1.00    2019/03/25
 *
 *  Copyright   (c) 2019 Myungki Sa.
 *  Computer Science Engineering, Java, Daejeon, Korea
 *  All rights reserved.
 */

package baseball;

/**
 * Inning Class는 한 이닝을 위한 클래스이다.
 * 인스턴스 변수 strike과 ball이 있다.
 * 메서드는 toString 메서드 하나이며, 갯수에 따라 출력할 String을 반환한다.
 *
 * @version        1.00     2019년   3월  25일
 * @author         사명기
 */
public class Inning{

    /** 인스턴스 변수 strike. strike 갯수를 저장한다. */
    int strike;

    /** 인스턴스 변수 ball. ball의 갯수를 저장한다.*/
    int ball;

    /**
     * Inning 클래스의 생성자.
     * @param strike
     * @param ball
     */
    public Inning(int strike,int ball){
        this.strike=strike;
        this.ball=ball;
    }

    /**
     * 스트라이크, 볼 갯수에 따라 결과를 String으로 반환하기 위한 메서드.
     * @return
     */
    public String getResultToString(){
        StringBuilder sb=new StringBuilder();

        if(this.strike==3){
            return "3 스트라이크";           //
        }
        else if(this.strike>0){
            sb.append(this.strike).append(" 스트라이크");
        }

        if(this.ball>0){
            if(this.strike>0){
                sb.append(" ");
            }
            sb.append(this.ball).append(" 볼");
            return sb.toString();
        }

        return (this.strike>0) ? sb.toString() : "낫싱";
    }
}
