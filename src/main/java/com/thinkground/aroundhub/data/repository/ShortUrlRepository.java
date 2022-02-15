package com.thinkground.aroundhub.data.repository;

import com.thinkground.aroundhub.data.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    ShortUrl findByUrl(String url);

    ShortUrl findByOrgUrl(String originalUrl);

}