<<<<<<< HEAD
# DB 생성
=======
<<<<<<< HEAD
=======

>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
DROP DATABASE IF EXISTS sbs_proj_2023;
CREATE DATABASE sbs_proj_2023;
USE sbs_proj_2023;

<<<<<<< HEAD
# 게시물 테이블 생성
=======
<<<<<<< HEAD
=======
# 게시물 테이블 생성
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
CREATE TABLE article (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    title CHAR(100) NOT NULL,
    `body` TEXT NOT NULL
<<<<<<< HEAD
=======
<<<<<<< HEAD
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
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
);

# 게시물, 테스트 데이터 생성
INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목1',
`body` = '내용1';

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목2',
`body` = '내용2';

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목3',
`body` = '내용3';

#게시물 테이블에 회원정보 추가
ALTER TABLE article ADD COLUMN memberId INT(10) UNSIGNED NOT NULL AFTER `updateDate`;

# 기존 게시물의 작성자를 2번으로 지정
UPDATE article
SET memberId = 2;
WHERE memberid = 0;

SELECT * FROM article;

# 회원 테이블 생성
CREATE TABLE `member` (
<<<<<<< HEAD
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
    delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '(탈퇴여부)',
    delDate DATETIME COMMENT '탈퇴날짜'
  );
  
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
    delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '탈퇴여부',
    delDate DATETIME COMMENT '탈퇴날짜'
);

# 회원, 테스트 데이터 생성
<<<<<<< HEAD
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'admin',
loginPw = 'admin',
authLevel = 7,
`name` = '관리자',
nickname = '관리자',
cellphoneNo = '01011111111',
email = 'admin@gmail.com';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user1',
loginPw = 'user1',
`name` = '사용자1',
nickname = '사용자1',
cellphoneNo = '01011111111',
email = 'user1@gmail.com';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user2',
loginPw = 'user2',
`name` = '사용자2',
nickname = '사용자2',
cellphoneNo = '01011111111',
email = 'user2@gmail.com';

SELECT * FROM `member`;

# 게시판 테이블 생성
CREATE TABLE board (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    `code` CHAR(50) NOT NULL UNIQUE COMMENT 'notice(공지사항), free1(자유게시판1), free2(자유게시판2,...',
    `name` CHAR(50) NOT NULL UNIQUE COMMENT '게시판 이름',
    delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '삭제여부(0=탈퇴전, 1=탈퇴)',
    delDate DATETIME COMMENT '삭제날짜'
);

# 기본 게시판 생성
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


SELECT * FROM article;

# 게시판 테이블에 boardId 컬럼 추가
ALTER TABLE article ADD COLUMN boardId INT(10) UNSIGNED NOT NULL AFTER `memberId`;

# 1, 2번 게시물을 공지사항 게시물로 지정
UPDATE article
SET boardId = 1
WHERE id IN(1,2);

# 3번 게시물을 자유게시판 게시물로 지정
UPDATE article
SET boardId = 2
WHERE id IN(3);

SELECT * FROM board WHERE id = 1;
SELECT * FROM board WHERE id = 2;

/*
# 게시물 개수 늘리기
INSERT INTO article
(
    regDate, updateDate, memberId, boardId, title, `body`
)
select NOW(), now(), FLOOR(RAND() *2) + 1, FLOOR(RAND() *2) + 1, concat('제목_', rand()), CONCAT('내용_', RAND())
from article;
*/

SELECT * FROM article;
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
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
<<<<<<< HEAD
  
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
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c

DESC article;

ALTER TABLE article
ADD COLUMN hitCount INT(10) UNSIGNED NOT NULL DEFAULT 0;

# like 테이블 생성
CREATE TABLE reactionPoint (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    memberId INT(10) UNSIGNED NOT NULL,
    relTypeCode CHAR(30) NOT NULL COMMENT '관련데이터타입코드',
    relId INT(10) UNSIGNED NOT NULL COMMENT '관련데이터번호',
    `point` SMALLINT(2) NOT NULL
);

# 리액션포인트 테스트 데이터
# 1번 회원이 1번 article에 대해서 싫어요
INSERT INTO reactionPoint
SET regDate = NOW(),
updateDate = NOW(),
memberId = 1,
reltypeCode = 'article',
relId = 1,
`point` = -1;

# 1번 회원이 2번 article에 대해서 좋아요
INSERT INTO reactionPoint
SET regDate = NOW(),
updateDate = NOW(),
memberId = 1,
reltypeCode = 'article',
relId = 2,
`point` = 1;

# 2번 회원이 1번 article에 대해서 싫어요
INSERT INTO reactionPoint
SET regDate = NOW(),
updateDate = NOW(),
memberId = 2,
reltypeCode = 'article',
relId = 1,
`point` = -1;

# 2번 회원이 2번 article에 대해서 좋아요
INSERT INTO reactionPoint
SET regDate = NOW(),
updateDate = NOW(),
memberId = 2,
reltypeCode = 'article',
relId = 2,
`point` = 1;

# 3번 회원이 1번 article에 대해서 좋아요
INSERT INTO reactionPoint
SET regDate = NOW(),
updateDate = NOW(),
memberId = 3,
reltypeCode = 'article',
relId = 1,
`point` = 1;

SELECT * FROM reactionPoint;

<<<<<<< HEAD
=======

>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
SELECT A.*,
   IFNULL(SUM(RP.point), 0) AS extra__sumReactionPoint,
   IFNULL(SUM(IF(RP.point > 0, RP.point, 0)), 0) AS extra__goodReactionPoint,
   IFNULL(SUM(IF(RP.point < 0, RP.point, 0)), 0) AS extra__badReactionPoint
   FROM (
        SELECT A.*,
        M.nickname AS extra__writerName
        FROM article AS A
        LEFT JOIN MEMBER AS M
        ON A.memberId = M.id   
   ) AS A
   LEFT JOIN reactionPoint AS RP
   ON RP.relTypeCode = 'article'
   AND A.id = RP.relId
   GROUP BY A.id
<<<<<<< HEAD

SELECT A.*,
IFNULL(SUM(RP.point), 0) AS extra__sumReactionPoint,
IFNULL(SUM(IF(RP.point &gt; 0, RP.point, 0)), 0) AS extra__goodReactionPoint,
IFNULL(SUM(IF(RP.point &lt; 0, RP.point, 0)), 0) AS extra__badReactionPoint
FROM (
    SELECT A.*,
    M.nickname AS extra__writerName
    FROM article AS A
    LEFT JOIN MEMBER AS M
    ON A.memberId = M.id
) AS A
LEFT JOIN reactionPoint AS RP
ON RP.relTypeCode = 'article'
AND A.id = RP.relId
GROUP BY A.id

SELECT * FROM reactionPoint;
=======
=======

    INSERT INTO `member`
  SET regDate = NOW(),
  updateDate = NOW(),
  loginId ='user1',
  loginPw = 'user1',
  `name` = 'user1',
  nickname = 'user1',
  cellphoneNo ='01011111111',
  email = 'user1@gmail.com';
  
  INSERT INTO `member`
  SET regDate = NOW(),
  updateDate = NOW(),
  loginId ='user2',
  loginPw = 'user2',
  `name` = 'user2',
  nickname = 'user2',
  cellphoneNo ='01022222222',
  email = 'user2@gmail.com';
  
  INSERT INTO `member`
  SET regDate = NOW(),
  updateDate = NOW(),
  loginId ='user3',
  loginPw = 'user3',
  `name` = 'user3',
  nickname = 'user3',
  cellphoneNo ='01033333333',
  email = 'user3@gmail.com';

SELECT * FROM `member`;

# 게시판 테이블 생성
CREATE TABLE board (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    `code` CHAR(50) NOT NULL UNIQUE COMMENT 'notice(공지사항), free1(자유게시판1), free2(자유게시판2,...',
    `name` CHAR(50) NOT NULL UNIQUE COMMENT '게시판 이름',
    delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '삭제여부(0=탈퇴전, 1=탈퇴)',
    delDate DATETIME COMMENT '삭제날짜'
);

# 기본 게시판 생성
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


SELECT * FROM article;

# 게시판 테이블에 boardId 컬럼 추가
ALTER TABLE article ADD COLUMN boardId INT(10) UNSIGNED NOT NULL AFTER `memberId`;

# 1, 2번 게시물을 공지사항 게시물로 지정
UPDATE article
SET boardId = 1
WHERE id IN(1,2);

# 3번 게시물을 자유게시판 게시물로 지정
UPDATE article
SET boardId = 2
WHERE id IN(3);

SELECT * FROM board WHERE id = 1;
SELECT * FROM board WHERE id = 2;

/*
# 게시물 개수 늘리기
INSERT INTO article
(
    regDate, updateDate, memberId, boardId, title, `body`
)
select NOW(), now(), FLOOR(RAND() *2) + 1, FLOOR(RAND() *2) + 1, concat('제목_', rand()), CONCAT('내용_', RAND())
from article;
*/

SELECT * FROM article;
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
