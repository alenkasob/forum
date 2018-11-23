package com.frm.dao.service.impl;

import com.frm.dao.entity.GroupEntity;
import com.frm.dao.repository.GroupRepository;
import com.frm.dao.service.AbstractForumService;
import com.frm.dao.service.GroupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GroupServiceImpl
        extends AbstractForumService<GroupEntity, GroupRepository>
        implements GroupService {
}
