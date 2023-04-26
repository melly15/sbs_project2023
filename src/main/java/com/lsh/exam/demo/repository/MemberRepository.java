package com.lsh.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lsh.exam.demo.vo.Member;

@Mapper
public interface MemberRepository {
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======

>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	@Insert("""
			INSERT INTO `member`
			SET regDate = NOW(),
			updateDate = NOW(),
			loginId = #{loginId},
			loginPw = #{loginPw},
			`name` = #{name},
			nickname = #{nickname},
			cellphoneNo = #{cellphoneNo},
<<<<<<< HEAD
=======
<<<<<<< HEAD
			email = #{email}
			""")
	void join(@Param("loginId") String loginId, @Param("loginPw") String loginPw, @Param("name") String name, @Param("nickname") String nickname, @Param("cellphoneNo") String cellphoneNo, @Param("email") String email);

	@Select("""
			SELECT *
			FROM `member`
			ORDER BY
			id DESC
			""")
	List<Member> getMembers();

	@Select("SELECT LAST_INSERT_ID()")
	int getLastInsertId();
	
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
			email = #{email};
			""")
	public void join(@Param("loginId")String loginId,@Param("loginPw") String loginPw,@Param("name") String name, @Param("nickname")String nickname, @Param("email")String email, @Param("cellphoneNo")String cellphoneNo);
	
	@Select("""
			SELECT * 
			FROM `member`
			ORDER BY 
			id DESC
			""")
	public List<Member> getMembers();

	@Select("SELECT LAST_INSERT_ID()")
	public int getLastInsertId();

<<<<<<< HEAD
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.id = #{id}
			""")
<<<<<<< HEAD
	public Member getMemberById(@Param("id")int id);
	
	
=======
<<<<<<< HEAD
	Member getMemberById(@Param("id") int id);

=======
	public Member getMemberById(@Param("id")int id);
	
	
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.loginId = #{loginId}
			""")
<<<<<<< HEAD
	public Member getMemberByLoginId(@Param("loginId")String loginId);

	
=======
<<<<<<< HEAD
	Member getMemberByLoginId(@Param("loginId") String loginId);

=======
	public Member getMemberByLoginId(@Param("loginId")String loginId);

	
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.name = #{name}
<<<<<<< HEAD
=======
<<<<<<< HEAD
			AND M.email = #{email}
			""")
	Member getMemberByNameAndEmail(@Param("name") String name, @Param("email") String email);
}
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
			OR M.email = #{email}
			""")
	public Member getMemberByNameAndEmail(@Param("name")String name,@Param("email") String email);
	
	

}
<<<<<<< HEAD
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
