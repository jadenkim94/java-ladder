# 사다리 게임

## 구현해야 할 기능 목록
- [X] 참여 인원 이름 입력
    - [X] __ERROR__ : 공백 또는 null일 경우
    - [X] 쉼표(",") 기준으로 분리
        - [X] __ERROR__ : 쉼표가 없을 경우

- [X] 참여 인원 생성
    - [X] __ERROR__ : 이름 5자 초과일 경우   

- [X] 최대 사다리 높이 입력
    - [X] __ERROR__ : 공백 또는 null일 경우
    - [X] __ERROR__ : 숫자로 변환할 수 없는 문자일 경우

- [X] 사다리 생성   
    - [X] 사다리 높이 만큼의 사다리의 각 가로 라인 생성
        - [X] 가로 라인당 각 좌표 생성
            - [X] 좌표 생성
                - [X] 좌표가 가지는 방향 생성
                    - [X] 랜덤 생성 전략 적용
                    - [X] __ERROR__ : 좌, 우 방향 모두 존재할 경우

- [X] 결과 출력
    - [X] 참여 인원 이름 출력
    - [X] 사다리 출력
    
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)