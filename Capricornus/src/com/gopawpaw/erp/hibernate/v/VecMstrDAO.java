package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VecMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VecMstr
 * @author MyEclipse Persistence Tools
 */

public class VecMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VecMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VecMstr transientInstance) {
		log.debug("saving VecMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VecMstr persistentInstance) {
		log.debug("deleting VecMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VecMstr findById(com.gopawpaw.erp.hibernate.v.VecMstrId id) {
		log.debug("getting VecMstr instance with id: " + id);
		try {
			VecMstr instance = (VecMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VecMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VecMstr instance) {
		log.debug("finding VecMstr instance by example");
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
		log.debug("finding VecMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VecMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VecMstr instances");
		try {
			String queryString = "from VecMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VecMstr merge(VecMstr detachedInstance) {
		log.debug("merging VecMstr instance");
		try {
			VecMstr result = (VecMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VecMstr instance) {
		log.debug("attaching dirty VecMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VecMstr instance) {
		log.debug("attaching clean VecMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VecMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VecMstrDAO) ctx.getBean("VecMstrDAO");
	}
}