package com.thinkground.aroundhub.data.service;

import com.thinkground.aroundhub.data.dto.ShortUrlResponseDto;

public interface ShortUrlService {

    ShortUrlResponseDto getShortUrl(String clientId, String clientSecret, String originalUrl);

    ShortUrlResponseDto generateShortUrl(String clientId, String clientSecret, String originalUrl);

    ShortUrlResponseDto updateShortUrl(String clientId, String clientSecret, String originalUrl);

    void deleteShortUrl(String shortUrl);

}
