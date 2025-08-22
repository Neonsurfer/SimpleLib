package com.simple.simpleLib.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BaseDto {
    Boolean success;

}
