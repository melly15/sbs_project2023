package com.lsh.exam.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lsh.exam.demo.vo.Board;

@Mapper
public interface BoardRepository {
<<<<<<< HEAD
	@Select("""
			SELECT *
			FROM board AS B
			WHERE B.id = #{id}
			AND B.delStatus = 0
			""")
	Board getBoardById(@Param("id") int id);
}
=======
	
	@Select("""
			select * 
			from board as b
			where b.id = #{id}
			and b.delstatus = 0
			""")
	Board getBoardById(@Param("id") int id);
}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
