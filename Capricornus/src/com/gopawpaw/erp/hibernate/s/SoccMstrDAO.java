package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SoccMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SoccMstr
 * @author MyEclipse Persistence Tools
 */

public class SoccMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SoccMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SoccMstr transientInstance) {
		log.debug("saving SoccMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SoccMstr persistentInstance) {
		log.debug("deleting SoccMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SoccMstr findById(com.gopawpaw.erp.hibernate.s.SoccMstrId id) {
		log.debug("getting SoccMstr instance with id: " + id);
		try {
			SoccMstr instance = (SoccMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SoccMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SoccMstr instance) {
		log.debug("finding SoccMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SoccMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SoccMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SoccMstr instances");
		try {
			String queryString = "from SoccMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SoccMstr merge(SoccMstr detachedInstance) {
		log.debug("merging SoccMstr instance");
		try {
			SoccMstr result = (SoccMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SoccMstr instance) {
		log.debug("attaching dirty SoccMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SoccMstr instance) {
		log.debug("attaching clean SoccMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SoccMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SoccMstrDAO) ctx.getBean("SoccMstrDAO");
	}
}