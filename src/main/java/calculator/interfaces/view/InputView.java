package calculator.interfaces.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public InputView() {
    }

    public String readUserInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return Console.readLine();
    }
}
