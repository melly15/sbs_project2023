package com.lsh.exam.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lsh.exam.demo.repository.ArticleRepository;
import com.lsh.exam.demo.utill.Ut;
import com.lsh.exam.demo.vo.Article;
import com.lsh.exam.demo.vo.ResultData;

@Service
public class ArticleService {
<<<<<<< HEAD
   private ArticleRepository articleRepository;
   
   public ArticleService(ArticleRepository articleRepository) {
      this.articleRepository = articleRepository;
      
   }
   
   public Article getForPrintArticle(int actorId,int id) {
	   Article article = articleRepository.getForPrintArticle(id);
	   
	   updateForPrintData(actorId, article);
	   
      return article;
   }
   
   public List<Article> getForPrintArticles(int actorId, int boardId, String searchKeywordTypeCode, String searchKeyword, int itemsCountInAPage, int page) {
	   
		//select * from article where boardId=1 order by id desc limit 0,10 
	   
	   int limitStart = (page -1) * itemsCountInAPage;
	   int limitTake = itemsCountInAPage;
	   
	   List<Article> articles = articleRepository.getForPrintArticles(boardId, limitStart, limitTake, searchKeywordTypeCode, searchKeyword);
	   
	   for(Article article : articles) {
		   updateForPrintData(actorId, article);
	   }
      return articles;
   }
   
   private void updateForPrintData(int actorId, Article article) {
	   if (article == null) {
		   return;
	   }
	   
	   ResultData actorCanDeleteRd = actorCanDelete(actorId, article);
	   article.setExtra__actorCanDelete(actorCanDeleteRd.isSuccess());
	   
	   ResultData actorCanModifyRd = actorCanModify(actorId, article);
	   article.setExtra__actorCanModify(actorCanModifyRd.isSuccess());
   }
   
   public ResultData actorCanDelete(int actorId, Article article) {
	   
	   if (article == null ) {
		  return ResultData.from("F-1", "게시물이 존재하지 않습니다.");
	   }
	   
	   if (article.getMemberId() != actorId ) {
		   return ResultData.from("F-2", "권한이 없습니다.");
	   }
	   
	   return ResultData.from("S-1", "게시물 삭제가 가능합니다.");
   }
   
   public ResultData<Integer> writeArticle(int memberId, int boardId, String title, String body) {
      articleRepository.writeArticle(memberId,boardId,title, body);
      
      int id = articleRepository.getLastInsertId();
      return ResultData.from("S-1", Ut.f("%d번 게시물이 생성 되었습니다.", id), "id", id);
   }
   
   public void deleteArticle(int id) {
      articleRepository.deleteArticle(id);
   }

   public ResultData<Article> modifyArticle(int id, String title, String body) {
      articleRepository.modifyArticle(id, title, body);
      
      Article article = getForPrintArticle(0,id);
      
      return ResultData.from("S-1", Ut.f("%d번 게시물이 수정되었습니다.", id), "article", article);
   }

   public ResultData actorCanModify(int actorId, Article article) {
      if ( article == null ) {
         return ResultData.from("F-1", "권한이 없습니다.");
      }
      
      if  ( article.getMemberId() != actorId) {
         return ResultData.from("F-2", "권한이 없습니다.");
      }
      
      return ResultData.from("S-1", "수정 가능합니다.");
   }
   
   public int getArticlesCount(int boardId, String searchKeywordTypeCode, String searchKeyword) {
	   return articleRepository.getArticlesCount(boardId, searchKeywordTypeCode, searchKeyword);
   }

public ResultData<Integer> increaseHitCount(int id) {
	int affectedRowsCount = articleRepository.increaseHitCount(id);
	
	if(affectedRowsCount == 0) {
		return ResultData.from("F-","해당 게시물이 존재하지 않습니다.", "affectedRowsCount", affectedRowsCount);
	}
	
	return ResultData.from("S-1", "조회수가 증가되었습니다.", "affectedRowsCount", affectedRowsCount);
	
}

public int getArticleHitCount(int id) {
	
	return articleRepository.getArticleHitCount(id);
}



=======
	private ArticleRepository articleRepository;
	
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	
	public Article getForPrintArticle(int actorId, int id) {
		Article article = articleRepository.getForPrintArticle(id);
		
		updateForPrintData(actorId, article);
		
		return article;
	}
	
<<<<<<< HEAD
	public List<Article> getForPrintArticles(int actorId, int boardId, String searchKeywordTypeCode, String searchKeyword, int itemsCountInAPage, int page) {
		int limitStart = (page - 1) * itemsCountInAPage;
		int limitTake = itemsCountInAPage;
		
		List<Article> articles = articleRepository.getForPrintArticles(boardId, limitStart, limitTake, searchKeywordTypeCode, searchKeyword);
=======
	public List<Article> getForPrintArticles(int actorId, int boardId, int itemsCountInAPage, int page) {
		
		/*
		 SELECT *
		 FROM article
		 WHERE boardId = 1
		 ORDER BY id DESC
		 LIMIT 0, 10
		 */
		
		int limitStart = (page - 1) * itemsCountInAPage;
		int limitTake = itemsCountInAPage;
		
		List<Article> articles = articleRepository.getForPrintArticles(boardId, limitStart, limitTake);
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
		
		for ( Article article : articles ) {
			updateForPrintData(actorId, article);
		}
		
		return articles;
	}
	
	private void updateForPrintData(int actorId, Article article) {
		if ( article == null ) {
			return;
		}
		
		ResultData actorCanDelteRd = actorCanDelete(actorId, article);
		article.setExtra__actorCanDelete(actorCanDelteRd.isSuccess());
		
		ResultData actorCanMoidyRd = actorCanModify(actorId, article);
		article.setExtra__actorCanModify(actorCanMoidyRd.isSuccess());
	}
	
	public ResultData actorCanDelete(int actorId, Article article) {
		if ( article == null ) {
			return ResultData.from("F-1", "게시물이 존재하지 않습니다.");
		}
		
		if ( article.getMemberId() != actorId ) {
			return ResultData.from("F-2", "권한이 없습니다.");
		}
		
		return ResultData.from("S-1", "게시물 삭제가 가능합니다.");
	}
	
	public ResultData<Integer> writeArticle(int memberId, int boardId, String title, String body) {
		articleRepository.writeArticle(memberId, boardId, title, body);
		int id = articleRepository.getLastInsertId();
		
		return ResultData.from("S-1", Ut.f("%d번 게시물이 생성되었습니다.", id), "id", id);
	}
	
	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);
	}

	public ResultData<Article> modifyArticle(int id, String title, String body) {
		articleRepository.modifyArticle(id, title, body);
		
		Article article = getForPrintArticle(0, id);
		
		return ResultData.from("S-1", Ut.f("%d번 게시물이 수정되었습니다.", id), "article", article);
	}

	public ResultData actorCanModify(int actorId, Article article) {
		if ( article == null ) {
			return ResultData.from("F-1", "권한이 없습니다.");
		}
		
		if ( article.getMemberId() != actorId ) {
			return ResultData.from("F-2", "권한이 없습니다.");
		}
		
		return ResultData.from("S-1", "수정가능합니다.");
	}

<<<<<<< HEAD
	public int getArticlesCount(int boardId, String searchKeywordTypeCode, String searchKeyword) {
		return articleRepository.getArticlesCount(boardId, searchKeywordTypeCode, searchKeyword);
	}

	public ResultData<Integer> increaseHitCount(int id) {
		int affectedRowsCount = articleRepository.increaseHitCount(id);
		
		if ( affectedRowsCount == 0 ) {
			return ResultData.from("F-1", "해당 게시물이 존재하지 않습니다.","affectedRowsCount", affectedRowsCount);
		}
		
		return ResultData.from("S-1", "조회수가 증가되었습니다.", "affectedRowsCount", affectedRowsCount);
	}

	public int getArticleHitCount(int id) {
		return articleRepository.getArticleHitCount(id);
=======
	public int getArticlesCount(int boardId) {
		return articleRepository.getArticlesCount(boardId);
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	}
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
}