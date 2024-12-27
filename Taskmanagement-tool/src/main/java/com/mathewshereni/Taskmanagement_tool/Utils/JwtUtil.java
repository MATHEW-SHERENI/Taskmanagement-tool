package com.mathewshereni.Taskmanagement_tool.Utils;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;

@Component
public class JwtUtil {
    public String generateToken(UserDetails userDetails){
        return generateToken(new HashMap<>(), userDetails);

        public String generateToken(Map<String,Object> extraClaims, UserDetails userDetails){
            return jwts.builder().setClaims(extraClaims).setSubject(userDetails.getUsername())
                    .setIssueAt(new Date(System.currentTimeMillis()))
                    .setExpiration(new Date(System.currentTimeMillis()+1000*60*60*24))
                    .signWith(getSigningKey().SignatureAlgorithm.HS256).compact();
        }


    }





}
