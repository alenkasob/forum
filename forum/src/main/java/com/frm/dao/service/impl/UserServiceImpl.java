package com.frm.dao.service.impl;

import com.frm.dao.entity.UserEntity;
import com.frm.dao.repository.UserRepository;
import com.frm.dao.service.AbstractForumService;
import com.frm.dao.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl
        extends AbstractForumService<UserEntity, UserRepository>
        implements UserService {
}
