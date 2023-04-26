package com.lsh.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lsh.exam.demo.vo.Article;

@Mapper
public interface ArticleRepository {
<<<<<<< HEAD
	public Article getForPrintArticle(@Param("id") int id);
	
	public List<Article> getForPrintArticles(int boardId, int limitStart, int limitTake, String searchKeywordTypeCode, String searchKeyword);
	
	public void writeArticle(@Param("memberId") int memberId, @Param("boardId") int boardId, @Param("title") String title, @Param("body") String body);
	
	public void deleteArticle(@Param("id") int id);

	public void modifyArticle(@Param("id") int id, @Param("title") String title, @Param("body") String body);

	public int getLastInsertId();

	public int getArticlesCount(int boardId, String searchKeywordTypeCode, String searchKeyword);

	public int increaseHitCount(int id);
	
	public int getArticleHitCount(int id);
=======

	// select * from article where id = ?
	// @Select("SELECT * FROM article WHERE id = #{id}")
	public Article getForPrintArticle(@Param("id") int id);

	// @Select("SELECT * FROM article ORDER BY id DESC")
	public List<Article> getForPrintArticles(@Param("boardId") int boardId,@Param("limitStart") int limitStart,@Param("limitTake") int limitTake);

	// @Insert("INSERT INTO article SET regDate = NOW(), updateDate = NOW(), title =
	// #{title}, `body`= #{body}")
	public void writeArticle(@Param("memberId") int memberId, @Param("boardId") int boardId, @Param("title") String title, @Param("body") String body);
	// delete from article where id = ?
	// @Delete("DELETE FROM article WHERE id = #{id}")
	public void deleteArticle(@Param("id") int id);

	// update from article set title = ?, `body` = ?, updateDate = now() where id =
	// ?
	// @Update("UPDATE article SET title = #{title}, `body` = #{body}, updateDate =
	// NOW() WHERE id = #{id}")
	public void modifyArticle(@Param("id") int id, @Param("title") String title, @Param("body") String body);

	// @Select("SELECT LAST_INSERT_ID()")
	public int getLastInsertId();
	public int getArticlesCount(@Param("boardId") int boardId);	
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
}
