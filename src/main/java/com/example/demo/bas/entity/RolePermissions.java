package com.example.demo.bas.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author tang
 * @since 2020-04-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RolePermissions对象", description="")
public class RolePermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long roleId;

    private Long permissionsId;


}
