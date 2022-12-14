package tech.antoniosgarbi.desafioapi.mapper;

import tech.antoniosgarbi.desafioapi.dto.AccessTagRegisterDTO;
import tech.antoniosgarbi.desafioapi.model.AccessTagRegister;

public class AccessTagRegisterMapper {

    private AccessTagRegisterMapper() {}

    public static AccessTagRegisterDTO toDTO(AccessTagRegister model) {
        AccessTagRegisterDTO dto  = new AccessTagRegisterDTO();

        dto.setId(model.getId());
        dto.setTag(model.getTag().getTag());
        dto.setDate(model.getDate());

        return dto;
    }

}
