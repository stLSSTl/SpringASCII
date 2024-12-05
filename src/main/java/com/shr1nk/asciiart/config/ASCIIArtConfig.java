package com.shr1nk.asciiart.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * <p>读取用户配置</p>
 * <p>读取用户的yml或者yaml或者properties文件</p>
 * @author shr1nk
 * @since 2024/12/5
 */

@Configuration
@ConfigurationProperties(prefix = "ascii")
public class ASCIIArtConfig {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
