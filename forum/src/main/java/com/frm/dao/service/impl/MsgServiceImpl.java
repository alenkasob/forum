package com.frm.dao.service.impl;

import com.frm.dao.entity.MsgEntity;
import com.frm.dao.repository.MsgRepository;
import com.frm.dao.service.AbstractForumService;
import com.frm.dao.service.MsgService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MsgServiceImpl
        extends AbstractForumService<MsgEntity, MsgRepository>
        implements MsgService {
}
