# java-miniproject
## 미니프로젝트 1 - 야구 관리 프로그램

/* 스타디움(야구장) -> 3개 */
INSERT INTO stadium(name, created_at) VALUES('사직야구장', '1985-10-14');
INSERT INTO stadium(name, created_at) VALUES('고척스카이돔', '2015-09-15');
INSERT INTO stadium(name, created_at) VALUES('광주기아챔피언스필드', '2014-03-08');

select * from stadium;


/* 팀 -> 3개 */
INSERT INTO team(stadium_id, name, created_at) VALUES(1, '롯데', '1975-01-01');
INSERT INTO team(stadium_id, name, created_at) VALUES(1, '키움', '2008-01-01');
INSERT INTO team(stadium_id, name, created_at) VALUES(1, '기아', '1982-01-01');

select * from team;


/* 플레이어(선수) -> 3개 */
-- 1번팀 롯데
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '손성빈', '포수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '고승민', '1루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '박승욱', '2루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '한동희', '3루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '최준용', '투수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '노진혁', '유격수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '황성빈', '좌익수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '김민석', '중견수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(1, '윤동희', '우익수', now());

-- 2번팀 키움
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '이지영', '포수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '이원석', '1루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '김혜성', '2루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '김휘집', '3루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '정창헌', '투수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '에디슨러셀', '유격수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '임병욱', '좌익수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '이정후', '중견수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(2, '이형종', '우익수', now());

-- 3번팀 기아
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '신범수', '포수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '김석환', '1루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '김선빈', '2루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '류지혁', '3루수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '임기영', '투수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '박찬호', '유격수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '고종욱', '좌익수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '김호령', '중견수', now());
INSERT INTO player(team_id, name, position, created_at) VALUES(3, '이우성', '우익수', now());