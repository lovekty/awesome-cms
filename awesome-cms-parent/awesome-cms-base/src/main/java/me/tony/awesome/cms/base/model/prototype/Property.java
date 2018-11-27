package me.tony.awesome.cms.base.model.prototype;

import lombok.Data;

/**
 * @author tony.zhuby
 * @date 2018-11-26
 */
@Data
public class Property {
    private String key;
    private String name;
    private String type;
    private String description;
}
