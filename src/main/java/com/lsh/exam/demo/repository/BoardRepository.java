package com.lsh.exam.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lsh.exam.demo.vo.Board;

@Mapper
public interface BoardRepository {
	
	@Select("""
			select * 
			from board as b
			where b.id = #{id}
			and b.delstatus = 0
			""")
	Board getBoardById(@Param("id") int id);
}
