package com.hcb.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author ChengBing Han
 * @date 22:12  2018/11/12
 * @description
 */
public class HelloJedis {
    public static void main(String[] args) {


        /*
        redis.conf
         将配置文件中的bind 127.0.0.1注释掉

         找到配置文件中protected mode，默认protected mode yes，需要将其改为protected mode no
         */
        final Jedis jedis = new Jedis("192.168.92.132", 6379);
        final String ping = jedis.ping();
        System.out.println(ping);
    }
}
