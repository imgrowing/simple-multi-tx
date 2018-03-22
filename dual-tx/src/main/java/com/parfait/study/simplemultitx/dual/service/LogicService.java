package com.parfait.study.simplemultitx.dual.service;

import com.parfait.study.simplemultitx.dual.service.board.BoardService;
import com.parfait.study.simplemultitx.dual.service.member.MemberService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional("boardTxManager")
public class LogicService {

    private final MemberService memberService;
    private final BoardService boardService;

    @Autowired
    public LogicService(@NonNull MemberService memberService, @NonNull BoardService boardService) {
        this.memberService = memberService;
        this.boardService = boardService;
    }

    public void required_required() {
        memberService.saveWithRequired();
        boardService.saveWithRequired();
    }

    public void required_requiresNew() {
        memberService.saveWithRequired();
        boardService.saveWithRequiresNew();
    }

    public void required_nested() {
        memberService.saveWithRequired();
        boardService.saveWithNested();
    }

    public void requiresNew_required() {
        memberService.saveWithRequiresNew();
        boardService.saveWithRequired();
    }

    public void requiresNew_requiresNew() {
        memberService.saveWithRequiresNew();
        boardService.saveWithRequiresNew();
    }

    public void requiresNew_nested() {
        memberService.saveWithRequiresNew();
        boardService.saveWithNested();
    }

    public void nested_required() {
        memberService.saveWithNested();
        boardService.saveWithRequired();
    }

    public void nested_requiresNew() {
        memberService.saveWithNested();
        boardService.saveWithRequiresNew();
    }

    public void nested_nested() {
        memberService.saveWithNested();
        boardService.saveWithNested();
    }
}
