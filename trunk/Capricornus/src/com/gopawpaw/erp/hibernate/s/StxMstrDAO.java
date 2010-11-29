package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * StxMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.StxMstr
 * @author MyEclipse Persistence Tools
 */

public class StxMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(StxMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(StxMstr transientInstance) {
		log.debug("saving StxMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(StxMstr persistentInstance) {
		log.debug("deleting StxMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StxMstr findById(com.gopawpaw.erp.hibernate.s.StxMstrId id) {
		log.debug("getting StxMstr instance with id: " + id);
		try {
			StxMstr instance = (StxMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.StxMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StxMstr instance) {
		log.debug("finding StxMstr instance by example");
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
		log.debug("finding StxMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from StxMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all StxMstr instances");
		try {
			String queryString = "from StxMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StxMstr merge(StxMstr detachedInstance) {
		log.debug("merging StxMstr instance");
		try {
			StxMstr result = (StxMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StxMstr instance) {
		log.debug("attaching dirty StxMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StxMstr instance) {
		log.debug("attaching clean StxMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static StxMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (StxMstrDAO) ctx.getBean("StxMstrDAO");
	}
}