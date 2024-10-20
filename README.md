# java-calculator-precourse

## 1. 사용자 입력 처리

### 1.1. 사용자 입력 받기

- [ ] 사용자로부터 입력을 받는다.

### 1.2. 입력을 검증하기 (1차 검증)

- [ ] 입력이 null, "", " ", "\n" 일 수 없다.
- [ ] 공백이 있어서는 안된다.

### 1.3. 예외 발생시키기

- [ ] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨다.

## 2. 문자열 분리하고 검증하기

### 2.1. 커스텀 구분자가 있는지 확인한다. (2차 검증)

- [x] 길이가 5보다 작다면, 커스텀 구분자가 없다.
- [x] 구분자가 존재하는 형식인지 확인한다.
    - [x] `//`로 시작하며, `\n`으로 끝난다면, 하나의 구분자를 반환한다.
- [x] 구분자를 검증한다.
    - [x] 숫자일 수 없다.

### 2.2. 구분자 리스트를 만든다.

- [x] 커스텀 구분자가 없다면, default separator 리스트를 반환한다.
    - [x] default separator : 쉼표(,)와 콜론(:)을 포함하는 Set
- [x] 커스텀 구분자가 있다면, default separator 리스트에 커스텀 구분자를 추가한다.

### 2.3. 문자열에서 커스텀 구분자 형식을 제거한다.

- [x] 커스텀 구분자가 없다면, 기존의 문자열을 반환한다.
- [x] 커스텀 구분자가 있다면, 커스텀 구분자 형식을 제거한 문자열을 반환한다.

### 2.4. 남은 문자열에서 구분자를 모두 제거한다.

- [x] 구분자 리스트를 돌며, 남은 문자열에 존재하는 구분자를 모두 제거한다.

## 3. 남은 문자열을 검증한다.

- [ ] 남은 문자열에서 커스텀 구분자를 제외하면 숫자만 남아야 한다. 이외의 문자열이 등장해서는 안된다.
- [ ] long 범위를 벗어나는 숫자는 올 수 없다.

## 4. 숫자 더하기

- [ ] 숫자의 합을 구한다.

## 5. 출력하기

- [ ] 결과를 콘솔에 출력한다.