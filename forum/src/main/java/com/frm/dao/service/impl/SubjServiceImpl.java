package com.frm.dao.service.impl;

import com.frm.dao.entity.SubjEntity;
import com.frm.dao.repository.SubjRepository;
import com.frm.dao.service.AbstractForumService;
import com.frm.dao.service.SubjService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SubjServiceImpl
        extends AbstractForumService<SubjEntity, SubjRepository>
        implements SubjService {
}
