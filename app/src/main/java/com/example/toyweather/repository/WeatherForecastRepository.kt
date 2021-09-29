package com.example.toyweather.repository

// 데이터 출처(로컬 DB인지 API응답인지 등)와 관계 없이
// 동일 인터페이스로 데이터에 접속할 수 있도록 만드는 것을 Repository 패턴이라고 하는데
// 레포지토리는 데이터 소스에 액세스하는 데 필요한 논리를 캡슐화하는 클래스 또는 구성 요소이다.
//
//출처: https://devvkkid.tistory.com/196 [개발자입니까?]

// 이후에 캐시를 사용할 수도 있으므로 레포지토리를 만들어 데이터가 어디에 있던지
// 속도와 정확성을 고려하여 적절한 위치(외부 서버, 내부 저장소)에 있는 데이터를 가져올 예정이다.

class WeatherForecastRepository {
}