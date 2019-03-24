/*
 *  @(#)Computer.java       1.00    2019/03/24
 *
 *  Copyright   (c) 2019 Myungki Sa.
 *  Computer Science Engineering, Java, Daejeon, Korea
 *  All rights reserved.
 */

package baseball;


/**
 * Computer Class는 컴퓨터를 위한 클래스이다.
 * Player interface를 구현한다.
 * 인스턴스 변수인 numbers 배열이 있다. 이 배열은 컴퓨터가 랜덤으로 생성한 세 자리의 수를 저장하기 위한 배열이다.
 * 세 수를 생성하는 메서드가 있다.
 *
 * @version        1.00     2019년   3월  24일
 * @author         사명기
 */
public class Computer implements Player{

    /** 인스턴스 변수 numbers는 Computer가 생성한 세 자리의 수를 저장하기위한 배열 */
    private int[] numbers;

    /**
     *  매개변수가 없는 기본 생성자
     */
    public Computer(){
    }

    /**
     * 인스턴스 변수 numbers의 Setter
     * @param numbers
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * 인스턴스 변수 numbers의 getter
     * @return
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * 랜덤한 수를 만들어서 배열에 담아 배열을 반환하는 메서드.
     * @return randomNumber Array
     */
    public int[] makeRandomNumber(){
        int[] randomNumber=new int[3];
        for(int i=0;i<3;i++){
            randomNumber[i]=(int)(Math.random()*9)+1;       // 1~9까지의 수를 랜덤하게 만들어서 배열에 저장.
        }
        return randomNumber;
    }

    /**
     * makerRandomNumber에서 만든 랜덤 수 배열을 확인하기 위한 메서드.
     * @param randomNumber  makeRandomNumber 메서드에서 만든 배열을 파라미터로 넣음
     * @return   세 숫자가 모두 다르면 true, 같은 숫자가 있을 경우 false 반환.
     */
    public boolean isValid(int[] randomNumber){
        /* 세 숫자가 모두 다르면 true, 같은 숫자가 있을 경우 false 반환 */
        return (randomNumber[0]!=randomNumber[1]) && (randomNumber[1]!=randomNumber[2])
                && (randomNumber[0]!=randomNumber[2]);
    }

    @Override
    public void makeNewNumber() {

    }
}
