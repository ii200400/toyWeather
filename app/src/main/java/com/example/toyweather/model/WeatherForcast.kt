package com.example.toyweather.model

// 단기예보 데이터 클래스
// 사용하지 않을 UUU(풍속 동서성분), VVV(풍속 남북성분), WAV(파고?)는 저장하지 않는다.

data class WeatherForecast(
    // SKY 맑음(1), 구름많음(3), 흐림(4)
    val skyCode: Int = 0,
    // TMP
    val temperature: Int = 0,
    // TMN
    val minTemperature: Int = 0,
    // TMX
    val maxTemperature: Int = 0,
    // VEC
    val windDirection: Int = 0,
    // WED
    val windSpeed: Int = 0,
    // POP
    val precipitationProbability: Int = 0,
    // PTY
    // (초단기) 없음(0), 비(1), 비/눈(2), 눈(3), 빗방울(5), 빗방울눈날림(6), 눈날림(7)
    // (단기) 없음(0), 비(1), 비/눈(2), 눈(3), 소나기(4)
    val precipitationCode: Int = 0,
    // PCP
    val hourlyPrecipitation: String = "강수없음",
    // REH
    val humidity: Int = 0,
    // SNO
    val snowfall: String = "적설없음"
)
