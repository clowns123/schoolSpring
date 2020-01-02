insert into TBL_BOARD (bno, title, content, writer)
(select seq_board.nextval, title, content, writer from tbl_board);

commit;

select count(*) from tbl_board;

select * from tbl_board order by bno desc;

select * from tab;


select 
/* + INDEX_DESC(tbl_board pk_board)*/
*
from tbl_board where bno > 0;


select bno, title, content, writer, regdate, updatedate
		from
			(
			select /*+INDEX_DESC(tbl_board pk_board)*/
				rownum rn, bno, title, content, writer, regdate, updatedate
			from
				tbl_board
			where rownum <= 200
			)
		where rn > 100;