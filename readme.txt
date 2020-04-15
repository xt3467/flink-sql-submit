1. 数据结构
Id，姓名，性别，年龄，所属年级，[科目，考试时间，成绩，排名]

2. 指定文件名称，解析sql文件

3.读取外部数据源

4.字段对应不一致

5. 复杂类型对应配置（要求数据源）

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL,
  `full_name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `grade` int(11) DEFAULT NULL COMMENT '年级',
  `class` int(11) DEFAULT NULL COMMENT '班级',
  `gender` varchar(4) DEFAULT NULL COMMENT '性别',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `score` (
  `id` int(11) NOT NULL,
  `uid` int(11) NOT NULL COMMENT '用户Id',
  `course` varchar(32) DEFAULT NULL COMMENT '科目',
  `score` int(11) DEFAULT NULL COMMENT '分数',
  `exam_time` datetime DEFAULT NULL COMMENT '考试时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `avg_score` (
  `id` bigint(20) NOT NULL,
  `uid` int(11) NOT NULL COMMENT '学生Id',
  `full_name` varchar(64) DEFAULT NULL COMMENT '学生姓名',
  `grade` int(11) DEFAULT NULL COMMENT '年级',
  `class` int(11) DEFAULT NULL COMMENT '班级',
  `course` varchar(0) DEFAULT NULL COMMENT '科目',
  `avg_score` decimal(8,2) DEFAULT NULL COMMENT '平均成绩',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;