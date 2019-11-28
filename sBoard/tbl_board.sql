--<ScriptOptions statementTerminator=";"/>

create sequence seq_board;

--drop table tbl_board;
create table tbl_board (
	bno number(10, 0),
	title varchar2(200) not null,
	content varchar2(2000)not null,
	writer	varchar2(50) not null,
	regdate date default sysdate,
	updatedate date default sysdate
);

alter table tbl_board add constraint pk_board primary key (bno);

insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');

select * from tbl_board;
select * from tbl_board where bno=5;
update TBL_BOARD set title='테스트 제목1' where bno=1;

delete from tbl_board where bno = 3;

select * from tbl_board order by bno+1 desc;

select * from tbl_board order by bno desc;

select /*+INDEX_DESC(tbl_board pk_board)*/ * from tbl_board order by bno;

select rownum rn, bno, title from tbl_board;

select /*+INDEX_DESC(tbl_board pk_board)*/ rownum rn, bno, title from tbl_board  where bno> 0;

select /*+INDEX_ASC(tbl_board pk_board)*/ rownum rn, bno, title from tbl_board where bno> 0;

select /*+INDEX_DESC(tbl_board pk_board)*/rownum rn, bno, title from tbl_board where rownum <= 10;

select /*+INDEX_DESC(tbl_board pk_board)*/rownum rn, bno, title from tbl_board where rownum > 10 and rownum <= 20;

select /*+INDEX_DESC(tbl_board pk_board)*/rownum rn, bno, title from tbl_board where rownum <= 20;

select bno, title, content
from
(
	select /*+INDEX_DESC(tbl_board pk_board)*/
			rownum rn, bno, title, content 
	from tbl_board 
	where rownum <= 20 
)
where rn > 10;

select count(*) from tbl_board where bno > 0

insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');
insert into tbl_board(bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');