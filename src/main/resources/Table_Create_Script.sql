Create Table USERS (
  ID VARCHAR2(8) PRIMARY KEY,
  PASSWORD varchar2(8),
  NAME varchar2(20),
  ROLE varchar2(20)
);

insert into users values ('admin', '1234', '관리자', 'Admin');
insert into users values ('user', '1234', '홍길동', 'User');
commit;
select*from users;

Create Table Board (
  SEQ number(5) primary key,
  TITLE varchar2(200), 
  WRITER varchar2(20),
  CONTENT varchar2(2000),
  REGDATE date default sysdate,
  CNT number(5) default 0
);
insert into Board values(1, '가입인사', '관리자', '잘부탁 드립니다.', default, default);
select*from board;
commit;