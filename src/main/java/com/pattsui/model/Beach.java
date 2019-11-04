package com.pattsui.model;

import lombok.Getter;
import org.springframework.util.StringUtils;

public class Beach {

    @Getter
    private String name;
    @Getter
    private boolean hasWaves;

    public Beach(String name, boolean hasWaves) {
        if (StringUtils.isEmpty(name)) {
            throw new UnsupportedOperationException("Name must not be null");
        }
        this.name = name;
        this.hasWaves = hasWaves;
    }

    @Override
    public String toString() {
        String isPumping = "";
        if (!hasWaves) {
            isPumping = "not ";
        }
        return String.format("%s is %spumping", name, isPumping);
    }
}
