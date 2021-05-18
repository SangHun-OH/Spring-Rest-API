package com.sanghun.fullstack.controller;

import com.sanghun.fullstack.domain.BoardVO;
import com.sanghun.fullstack.domain.ResultVO;
import com.sanghun.fullstack.persistence.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class BoardController {
    private final BoardMapper boardMapper;

    @PostMapping("/board")
    public ResultVO addBoard(@RequestBody BoardVO boardVO) {
        int result = boardMapper.insertBoard(boardVO);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }

    @GetMapping("/board/{id}")
    public BoardVO findOne(@PathVariable int id) {
        return boardMapper.findOneBoard(id);
    }

    @GetMapping("/boards")
    public List<BoardVO> findAllBoard() {
        return boardMapper.findBoard();
    }

    @PutMapping("/board")
    public ResultVO modifyBoard(@RequestBody BoardVO boardVO) {
        int result = boardMapper.updateBoard(boardVO);
        if ( result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }

    @DeleteMapping("/board")
    public ResultVO removeBoard(@RequestParam int id) {
        int result = boardMapper.deleteBoard(id);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }

}
