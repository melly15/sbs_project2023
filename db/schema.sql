DROP DATABASE IF EXISTS sbs_proj_2023;
CREATE DATABASE sbs_proj_2023;
USE sbs_proj_2023;

CREATE TABLE article (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    title CHAR(100) NOT NULL,
    `body` TEXT NOT NULL
  );
  
  INSERT INTO article
  SET regDate = NOW(),
  updateDate = NOW(),
  title ='제목입니다',
  `body` = '내용입니다';
  
  
  
  INSERT INTO article
  SET regDate = NOW(),
  updateDate = NOW(),
  title ='제목1',
  `body` = '내용1';
  INSERT INTO article
  SET regDate = NOW(),
  updateDate = NOW(),
  title ='제목2',
  `body` = '내용2';
  
  #게시물 테이블에 회원정보 추가
  ALTER TABLE article ADD COLUMN memberId INT(10) UNSIGNED NOT NULL AFTER `updateDate`;
  
  #기존 게시물의 작성자를 2번으로 지정
  UPDATE article
  SET memberId = 2;
  WHERE memberid = 0;

  SELECT * FROM article;

  CREATE TABLE `member` (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    loginId CHAR(20) NOT NULL,
    `authLevel` SMALLINT(2) UNSIGNED DEFAULT 3 COMMENT '(3=일반, 7=관리자)',
    loginPw CHAR(60) NOT NULL,
    `name` CHAR(20) NOT NULL,
    `nickname` CHAR(20) NOT NULL,
    cellphoneNo CHAR(20) NOT NULL,
    email CHAR(50) NOT NULL,
    delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '(탈퇴여부)',
    delDate DATETIME COMMENT '탈퇴날짜'
  );
  
#테스트 데이터 생성
  INSERT INTO `member`
  SET regDate = NOW(),
  updateDate = NOW(),
  loginId ='admin',
  loginPw = 'admin',
  authLevel = 7,
  `name` = '관리자',
  nickname = '관리자',
  cellphoneNo ='01011111111',
  email = 'admin@gmail.com';
  
   INSERT INTO `member`
  SET regDate = NOW(),
  updateDate = NOW(),
  loginId ='mimi',
  loginPw = 'mimi',
  `name` = '회원',
  nickname = '회원',
  cellphoneNo ='01011111111',
  email = 'admin@gmail.com';
  
  INSERT INTO `member`
  SET regDate = NOW(),
  updateDate = NOW(),
  loginId ='mama',
  loginPw = 'mama',
  `name` = '회원1',
  nickname = '회원1',
  cellphoneNo ='01011111111',
  email = 'admin@gmail.com';
  
  SELECT * FROM MEMBER;
  
  SELECT A.*,
		M.nickname AS extra_writerName
		FROM article AS A
		LEFT JOIN MEMBER AS M
		ON A.memberId = M.id
		ORDER BY A.id DESC
  
  #게시판 테이블 생성
  CREATE TABLE board(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    `code` CHAR(50) NOT NULL COMMENT 'notice(공지사항), free(자유게시판1), free2(자유게시판2,...',
    `name` CHAR(50) NOT NULL COMMENT '게시판 이름',
    delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '삭제여부(0=탈퇴전, 1=탈퇴)',
    delDate DATETIME COMMENT '삭제날짜'
  );
  
#테스트 데이터 생성
  INSERT INTO board
  SET regDate = NOW(),
  updateDate = NOW(),
  `code` = 'notice',
  `name` = '공지사항';
  
  INSERT INTO board
  SET regDate = NOW(),
  updateDate = NOW(),
  `code` = 'free1',
  `name` = '자유';
  
  
  SELECT * FROM board;
  
  #게시판 테이블에 boardId 컬럼 추가
  ALTER TABLE article ADD COLUMN boardId INT(10) UNSIGNED NOT NULL AFTER `memberId`;
  
  SELECT * FROM article;
  
  #1,2번 게시물을 공지사항 게시물로 지정
  UPDATE article
  SET boardId = 1
  WHERE id IN(1,2);

#3번 게시물을 자유게시판 게시물로 지정
UPDATE article
  SET boardId = 2
  WHERE id IN(3);
  
  SELECT * FROM board WHERE id =1;
  SELECT * FROM board WHERE id=2;

  /*
  #게시물 개수 늘리기
  insert into article
  (regDate, updateDate, memberId, boardId, title, `body`)
  select now(),now(),floor(rand()*2)+1,floor(rand()*2)+1,concat('제목_',rand()),concat'내용_',rand())
  from article;
 */
 SELECT * FROM article;
  
  SELECT * FROM article;

DESC article;

ALTER TABLE article
ADD COLUMN hitCount INT(10) UNSIGNED NOT NULL DEFAULT 0;