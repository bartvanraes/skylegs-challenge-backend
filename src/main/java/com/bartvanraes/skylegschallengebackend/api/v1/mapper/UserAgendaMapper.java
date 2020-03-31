package com.bartvanraes.skylegschallengebackend.api.v1.mapper;

import com.bartvanraes.skylegschallengebackend.api.v1.model.UserAgendaDTO;
import com.bartvanraes.skylegschallengebackend.domain.UserAgenda;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserAgendaMapper {
    UserAgendaMapper INSTANCE = Mappers.getMapper(UserAgendaMapper.class);

    UserAgendaDTO userAgendaToUserAgendaDTO(UserAgenda userAgenda);
    UserAgenda userAgendaDTOToUserAgenda(UserAgendaDTO userAgenda);
}
