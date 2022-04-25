# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구 사항
- 주어진 횟수 동안 N대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에는 이름을 부여할 수 있다. 전진하는 자동차를 출력할 떄 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 Random 값을 수한 후 Random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
- 우승자가 한 명 이상일 경우 쉽표로 이름을 구분해서 출력한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.

## 제약사항
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- indent depth가 2를 넘지 않도록 한다.
- Stream API를 사용하지 않는다. ( 단, 람다는 사용가능 )
- else 예약어를 쓰지 않는다.
- 메서드의 길이가 10 라인을 넘지 않는다.
- 일급콜랙션을 활용해서 구현한다.
- 모든 원시값과 문자열을 포장한다.

## 추가 제약 사항
- 되도록 모든 객체를 불변객체로 만든다.
- getter를 사용하지 않는다.

## 구현 사항
- [ ] 경주할 자동차 이름을 입력받는다. (UI)
    - [x] 자동차 이름이 5자를 초과한다면 IllegalArgumentException을 던진다.
    - [x] 공백 입력 시 IllegalArgumentException을 던진다.
- [ ] 시도할 횟수를 입력받는다. (UI)
    - [x] 0 이하의 수 입력 시 IllegalArgumentException을 던진다.
    - [ ] 숫자 이외의 다른 문자 입력 시 IllegalArgumentException을 던진다.
- [ ] 경주게임을 시작한다.
    - [x] 0 ~ 9 사이의 Random 값을 구한다.
    - [ ] Random 값에 따라 자동차를 전진시킨다.
        - 4 이상 -> 전진
        - 3 이하 -> 정지
    - [ ] 게임 실행 결과를 기록한다.
    - [ ] "시도할 횟수"만큼 "랜덤값 추출 -> 자동차 정지/전진 -> 실행결과 기록"을 반복한다.
- [ ] 게임 실행 기록을 출력한다. (UI)
- [ ] 최종 결과를 출력한다. (UI)

